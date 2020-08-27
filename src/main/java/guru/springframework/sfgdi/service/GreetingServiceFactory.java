package guru.springframework.sfgdi.service;

public class GreetingServiceFactory {

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "en":
                    return new I18nEnglishGreetingService();
            case "es":
                    return new I18nSpanishGreetingService();
            default:
                    return new PrimaryGreetingService();
        }
    }
}
