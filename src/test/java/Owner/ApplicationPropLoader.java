package Owner;
import org.aeonbits.owner.ConfigFactory;

public class ApplicationPropLoader {

    public static AppProperties app = loadProps();

    private static AppProperties loadProps() {
        app=ConfigFactory.create(AppProperties.class);
        return app;
    }
}
