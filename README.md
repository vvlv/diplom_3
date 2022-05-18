# Diplom_3

для запуска в YandeBrowser 
должна отрабатывать конструкция

    ChromeDriver driver;
    @Before
    public void setBrowserForTests () {
System.setProperty("selenide.browser","/Users/sergejvavilov/yandexdriver/yandexdriver");
driver = new ChromeDriver();
setWebDriver(driver);

но мне не удалось подружить макОс с браузером