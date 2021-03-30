package be.technifutur.deploy.init;

import be.technifutur.deploy.entities.Flower;
import be.technifutur.deploy.services.FlowerService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataInit implements InitializingBean {

    private final FlowerService flowerService;

    private List<Flower> flowers = Arrays.asList(
            Flower.builder()
                    .name("Rose")
                    .build(),
            Flower.builder()
                    .name("Tulipe")
                    .build(),
            Flower.builder()
                    .name("Pensée")
                    .build()

    );

    public DataInit(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        flowers.forEach(flowerService::insert);

    }
}
