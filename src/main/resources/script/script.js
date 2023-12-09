const sign_in_btn = document.querySelector("#sign-in-btn");
const sign_up_btn = document.querySelector("#sign-up-btn");
const solid_btn = document.querySelector(".btn.solid");
const btn_sign_up = document.querySelector(".btn.transparent");

const container = document.querySelector(".container");

solid_btn.addEventListener("click", () => {
  container.classList.add("sign-up-mode");
});

btn_sign_up.addEventListener("click", () => {
  container.classList.remove("sign-up-mode");
});

sign_up_btn.addEventListener("click", () => {
  container.classList.add("sign-up-mode");
});

sign_in_btn.addEventListener("click", () => {
  container.classList.remove("sign-up-mode");
});
