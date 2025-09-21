function showSection(id) {
  // Cache toutes les sections
  document.querySelectorAll("section").forEach(sec => sec.classList.remove("active"));
  // Affiche uniquement celle cliquée
  document.getElementById(id).classList.add("active");
}
