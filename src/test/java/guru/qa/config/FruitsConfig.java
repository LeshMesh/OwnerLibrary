package guru.qa.config;

import org.aeonbits.owner.Config;

import java.util.List;

public interface FruitsConfig extends Config {

    @Key("array")
    String[] getFruitsArray();

    @Key("array-with-default")
    @DefaultValue("orange, apple")
    String[] getFruitsArrayWithDefault();

    @Key("list")
    List<String> getFruitsList();

    @Separator(";")
    @Key("list-with-default")
    List<String> getFruitsListWithSeparator();
}
