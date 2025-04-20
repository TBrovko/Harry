// Распределяющая шляпа
document.getElementById('sorting-hat').addEventListener('click', function() {
    const houses = ['Гриффиндор', 'Слизерин', 'Когтевран', 'Пуффендуй'];
    const randomHouse = houses[Math.floor(Math.random() * houses.length)];
    const houseColors = {
        'Гриффиндор': '#740001',
        'Слизерин': '#1a472a',
        'Когтевран': '#0e1a40',
        'Пуффендуй': '#ecb939'
    };
    
    alert(`Распределяющая шляпа решила отправить вас в ${randomHouse}!`);
    this.style.backgroundColor = houseColors[randomHouse];
});

// Плавная прокрутка для навигации
document.querySelectorAll('nav a').forEach(anchor => {
    anchor.addEventListener('click', function(e) {
        e.preventDefault();
        
        const targetId = this.getAttribute('href');
        const targetElement = document.querySelector(targetId);
        
        window.scrollTo({
            top: targetElement.offsetTop - 70,
            behavior: 'smooth'
        });
    });
});

// Слайдер персонажей
let currentCharacter = 0;
const characters = document.querySelectorAll('.character-card');
const totalCharacters = characters.length;

function showCharacter(index) {
    characters.forEach((character, i) => {
        character.style.display = i === index ? 'block' : 'none';
    });
}

// Инициализация
showCharacter(0);

// Можно добавить кнопки для переключения персонажей
