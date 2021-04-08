package pages;

public class Emmezta {

    private HomePage homePage;
    private FurniturePage furniturePage;
    private DollPillowPage dollPillowPage;
    private CartPage cartPage;
    private RabbitPillowPage rabbitPillowPage;
    private GardenFurniturePage gardenFurniturePage;
    private WoodenFurniturePage woodenFurniturePage;


    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public FurniturePage getFurniturePage() {
        if (furniturePage == null) {
            furniturePage = new FurniturePage();
        }
        return furniturePage;
    }

    public DollPillowPage getDollPillowPage() {
        if (dollPillowPage == null) {
            dollPillowPage = new DollPillowPage();
        }
        return dollPillowPage;
    }

    public CartPage getCartPage(){
        if (cartPage == null) {
            cartPage = new CartPage();
        }
        return cartPage;
    }

    public RabbitPillowPage getRabbitPillowPage() {
        if (rabbitPillowPage == null) {
            rabbitPillowPage = new RabbitPillowPage();
        }
        return rabbitPillowPage;
    }

    public GardenFurniturePage getGardenFurniturePage() {
        if (gardenFurniturePage == null) {
            gardenFurniturePage = new GardenFurniturePage();
        }
        return gardenFurniturePage;
    }

    public WoodenFurniturePage getWoodenFurniturePage() {
        if (woodenFurniturePage == null) {
            woodenFurniturePage = new WoodenFurniturePage();
        }
        return woodenFurniturePage;
    }
}
