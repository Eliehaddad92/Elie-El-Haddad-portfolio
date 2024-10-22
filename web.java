// JavaScript for Dynamic Elements and Interactivity

// Add smooth scrolling for internal links
document.querySelectorAll('a[href^="#"]').forEach(anchor => {
    anchor.addEventListener('click', function (e) {
        e.preventDefault();
        document.querySelector(this.getAttribute('href')).scrollIntoView({
            behavior: 'smooth'
        });
    });
});

// QR Code Generation
QRCode.toCanvas(document.getElementById('qrcode'), window.location.href, function (error) {
    if (error) console.error(error);
    console.log('QR code generated successfully!');
});

// Example: Modal for contact form
const contactButton = document.querySelector('#contact-button');
const modal = document.querySelector('#contact-modal');
const closeModal = document.querySelector('#close-modal');

if (contactButton && modal && closeModal) {
    contactButton.addEventListener('click', () => {
        modal.style.display = 'block';
    });

    closeModal.addEventListener('click', () => {
        modal.style.display = 'none';
    });

    window.addEventListener('click', (e) => {
        if (e.target == modal) {
            modal.style.display = 'none';
        }
    });
}

// Contact form validation example
const contactForm = document.querySelector('#contact-form');
if (contactForm) {
    contactForm.addEventListener('submit', (e) => {
        e.preventDefault();
