package com.rect2m;

import com.rect2m.entity.Category;
import com.rect2m.entity.Product;
import com.rect2m.service.CategoryService;
import com.rect2m.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private final CategoryService categoryService;
    private final ProductService productService;

    public Application(CategoryService categoryService, ProductService productService) {
        this.categoryService = categoryService;
        this.productService = productService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Створення категорій
        Category electronics = new Category("Електроніка");
        Category books = new Category("Книги");
        Category furniture = new Category("Меблі");
        Category clothing = new Category("Одяг");
        Category sports = new Category("Спорт");

        categoryService.saveCategory(electronics);
        categoryService.saveCategory(books);
        categoryService.saveCategory(furniture);
        categoryService.saveCategory(clothing);
        categoryService.saveCategory(sports);

        // Створення продуктів для категорії "Електроніка"
        Product phone = new Product("Смартфон", 10000, "phone.jpg", electronics);
        Product laptop = new Product("Ноутбук", 20000, "laptop.jpg", electronics);
        Product tv = new Product("Телевізор", 15000, "tv.jpg", electronics);
        Product headphones = new Product("Навушники", 3000, "headphones.jpg", electronics);
        Product tablet = new Product("Планшет", 12000, "tablet.jpg", electronics);
        Product camera = new Product("Фотокамера", 18000, "camera.jpg", electronics);
        Product smartWatch = new Product("Розумний годинник", 7000, "smartwatch.jpg", electronics);
        Product speaker = new Product("Портативна колонка", 5000, "speaker.jpg", electronics);
        Product keyboard = new Product("Клавіатура", 1200, "keyboard.jpg", electronics);
        Product mouse = new Product("Мишка", 800, "mouse.jpg", electronics);

        // Створення продуктів для категорії "Книги"
        Product novel = new Product("Роман", 300, "novel.jpg", books);
        Product historyBook = new Product("Історія світу", 500, "history.jpg", books);
        Product scienceFiction = new Product("Наукова фантастика", 400, "scifi.jpg", books);
        Product biography = new Product("Біографія відомих людей", 600, "biography.jpg", books);
        Product poetry = new Product("Збірка віршів", 250, "poetry.jpg", books);
        Product fantasy = new Product("Фентезі", 450, "fantasy.jpg", books);
        Product mystery = new Product("Детектив", 350, "mystery.jpg", books);
        Product horror = new Product("Жахи", 400, "horror.jpg", books);
        Product philosophy = new Product("Філософія", 600, "philosophy.jpg", books);
        Product selfHelp = new Product("Самовдосконалення", 700, "selfhelp.jpg", books);

        // Створення продуктів для категорії "Меблі"
        Product chair = new Product("Стілець", 1200, "chair.jpg", furniture);
        Product table = new Product("Стіл", 3000, "table.jpg", furniture);
        Product sofa = new Product("Диван", 10000, "sofa.jpg", furniture);
        Product bed = new Product("Ліжко", 8000, "bed.jpg", furniture);
        Product wardrobe = new Product("Шафа", 5000, "wardrobe.jpg", furniture);
        Product bookshelf = new Product("Книжкова полиця", 2000, "bookshelf.jpg", furniture);
        Product coffeeTable = new Product("Кавовий столик", 1500, "coffeetable.jpg", furniture);
        Product officeChair = new Product("Офісне крісло", 3500, "officechair.jpg", furniture);
        Product tvStand = new Product("Підставка для телевізора", 2500, "tvstand.jpg", furniture);
        Product dresser = new Product("Комод", 4500, "dresser.jpg", furniture);

        // Створення продуктів для категорії "Одяг"
        Product tshirt = new Product("Футболка", 300, "tshirt.jpg", clothing);
        Product jeans = new Product("Джинси", 1500, "jeans.jpg", clothing);
        Product jacket = new Product("Куртка", 3000, "jacket.jpg", clothing);
        Product shoes = new Product("Взуття", 2500, "shoes.jpg", clothing);
        Product dress = new Product("Сукня", 2000, "dress.jpg", clothing);
        Product cap = new Product("Кепка", 400, "cap.jpg", clothing);
        Product scarf = new Product("Шарф", 500, "scarf.jpg", clothing);
        Product shorts = new Product("Шорти", 700, "shorts.jpg", clothing);
        Product socks = new Product("Шкарпетки", 100, "socks.jpg", clothing);
        Product sweater = new Product("Светр", 1200, "sweater.jpg", clothing);

        // Створення продуктів для категорії "Спорт"
        Product football = new Product("Футбольний м'яч", 500, "football.jpg", sports);
        Product bicycle = new Product("Велосипед", 10000, "bicycle.jpg", sports);
        Product dumbbell = new Product("Гантелі", 700, "dumbbell.jpg", sports);
        Product treadmill = new Product("Бігова доріжка", 15000, "treadmill.jpg", sports);
        Product yogaMat = new Product("Килимок для йоги", 800, "yogamat.jpg", sports);
        Product tennisRacket = new Product("Тенісна ракетка", 2000, "tennisracket.jpg", sports);
        Product basketball = new Product("Баскетбольний м'яч", 600, "basketball.jpg", sports);
        Product runningShoes = new Product("Кросівки для бігу", 2500, "runningshoes.jpg", sports);
        Product swimmingGoggles = new Product("Окуляри для плавання", 1000, "goggles.jpg", sports);
        Product boxingGloves = new Product("Боксерські рукавички", 1500, "boxinggloves.jpg", sports);

        // Збереження продуктів
        productService.saveProduct(phone);
        productService.saveProduct(laptop);
        productService.saveProduct(tv);
        productService.saveProduct(headphones);
        productService.saveProduct(tablet);
        productService.saveProduct(camera);
        productService.saveProduct(smartWatch);
        productService.saveProduct(speaker);
        productService.saveProduct(keyboard);
        productService.saveProduct(mouse);

        productService.saveProduct(novel);
        productService.saveProduct(historyBook);
        productService.saveProduct(scienceFiction);
        productService.saveProduct(biography);
        productService.saveProduct(poetry);
        productService.saveProduct(fantasy);
        productService.saveProduct(mystery);
        productService.saveProduct(horror);
        productService.saveProduct(philosophy);
        productService.saveProduct(selfHelp);

        productService.saveProduct(chair);
        productService.saveProduct(table);
        productService.saveProduct(sofa);
        productService.saveProduct(bed);
        productService.saveProduct(wardrobe);
        productService.saveProduct(bookshelf);
        productService.saveProduct(coffeeTable);
        productService.saveProduct(officeChair);
        productService.saveProduct(tvStand);
        productService.saveProduct(dresser);

        productService.saveProduct(tshirt);
        productService.saveProduct(jeans);
        productService.saveProduct(jacket);
        productService.saveProduct(shoes);
        productService.saveProduct(dress);
        productService.saveProduct(cap);
        productService.saveProduct(scarf);
        productService.saveProduct(shorts);
        productService.saveProduct(socks);
        productService.saveProduct(sweater);

        productService.saveProduct(football);
        productService.saveProduct(bicycle);
        productService.saveProduct(dumbbell);
        productService.saveProduct(treadmill);
        productService.saveProduct(yogaMat);
        productService.saveProduct(tennisRacket);
        productService.saveProduct(basketball);
        productService.saveProduct(runningShoes);
        productService.saveProduct(swimmingGoggles);
        productService.saveProduct(boxingGloves);
    }
}
