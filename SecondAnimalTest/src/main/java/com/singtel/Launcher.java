package com.singtel;

import com.singtel.domain.*;
import com.singtel.domain.state.CaterpillarState;
import com.singtel.factory.*;
import lombok.ToString;

public class Launcher {
    public static void main(String args[]) {
        Chicken chicken = Chicken.builder().flyBehaviour(FlyFactory.getFlyBehaviour("NO_FLY"))
                .soundBehaviour(SoundFactory.getSoundBehaviour("CLUCK"))
                .walkBehaviour(WalkFactory.getWalkBehaviour("WALK")).build();

        Duck duck = Duck.builder().flyBehaviour(FlyFactory.getFlyBehaviour("FLY"))
                .soundBehaviour(SoundFactory.getSoundBehaviour("QUACK"))
                .walkBehaviour(WalkFactory.getWalkBehaviour("WALK")).build();

        Parrot parrot = Parrot.builder().flyBehaviour(FlyFactory.getFlyBehaviour("FLY"))
                .neighbour(duck).build();

        Parrot parrotChiNei = Parrot.builder().flyBehaviour(FlyFactory.getFlyBehaviour("FLY"))
                .neighbour(chicken).build();

        Dog dog = Dog.builder().soundBehaviour(SoundFactory.getSoundBehaviour("WOOF"))
                .walkBehaviour(WalkFactory.getWalkBehaviour("WALK")).build();

        Shark shark = Shark.builder().swimBehaviour(SwimFactory.getSwimBehaviour("SWIM"))
                .build();

        Butterfly butterfly = Butterfly.builder().state(new CaterpillarState()).build();

        Animal[] animals = {chicken, duck, parrot, parrotChiNei, dog, shark, butterfly};
        AnimalFeatureAggregator aggregator = new AnimalFeatureAggregator();
        for (Animal animal: animals) {
            aggregator.add(animal);
        }
        System.out.println("Animal Summary: " + aggregator);
        aggregator = new AnimalFeatureAggregator();
        butterfly.metamorphose();
        for (Animal animal: animals) {
            aggregator.add(animal);
        }
        System.out.println("Animal Summary: " + aggregator);

        Dolphin dolphin = Dolphin.builder().swimBehaviour(SwimFactory.getSwimBehaviour("SWIM")).build();
        dolphin.swim();
    }

}

@ToString
class AnimalFeatureAggregator{
    private int flyCount;
    private int walkCount;
    private int swimCount;
    private int soundCount;

    public void add(Animal animal){
        if(animal.canFly()){
            ++this.flyCount;
        }
        if(animal.canWalk()){
            ++this.walkCount;
        }
        if(animal.canSwim()){
            ++this.swimCount;
        }
        if(animal.canMakeSound()){
            ++this.soundCount;
        }
    }

    public void clearState(){
        this.flyCount = 0;
        this.walkCount = 0;
        this.swimCount = 0;
        this.soundCount = 0;
    }
}
