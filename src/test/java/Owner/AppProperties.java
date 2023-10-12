package Owner;

import org.aeonbits.owner.Config;

@Config.Sources({"file:C:/Users/sathish/IdeaProjects/SelfLearnExp/src/test/java/resources/env.properties"})
    public interface AppProperties extends Config {
    String url();

}
