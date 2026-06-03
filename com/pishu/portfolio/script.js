const mobileMenu = document.getElementById('mobile-menu');
const navLinks = document.getElementById('nav-links');

// Safety check using the correct variable name: 'mobileMenu'
if (mobileMenu && navLinks) {
  
  // 1. Toggle mobile menu open/closed
  mobileMenu.addEventListener("click", () => {
    navLinks.classList.toggle("active");
    
    // Toggle the accessibility attribute
    const isExpanded = mobileMenu.getAttribute("aria-expanded") === "true";
    mobileMenu.setAttribute("aria-expanded", !isExpanded);
  });

  // 2. Close the menu when any individual link is clicked (Great for smooth scrolling!)
  document.querySelectorAll("#nav-links a").forEach(link => {
    link.addEventListener("click", () => {
      navLinks.classList.remove("active");
      mobileMenu.setAttribute("aria-expanded", "false");
    });
  });

  // 3. Reset states if user resizes browser past 768px
  window.addEventListener("resize", () => {
    if (window.innerWidth > 768) {
      navLinks.classList.remove("active");
      mobileMenu.setAttribute("aria-expanded", "false");
    }
  });
}