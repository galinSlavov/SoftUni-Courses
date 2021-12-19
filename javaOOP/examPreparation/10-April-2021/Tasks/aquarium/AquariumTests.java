package aquarium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AquariumTests {
    private Fish fish;
    private Aquarium aquarium;

    @Before
    public void setUp() {
        fish = new Fish("Nemo");
        aquarium = new Aquarium("Water", 30);
    }

    @Test(expected = NullPointerException.class)
    public void setNameIsNull(){
        Aquarium aquariumNew = new Aquarium(null,22);
    }

    @Test(expected = NullPointerException.class)
    public void setNameIsWithSpaces(){
        Aquarium aquariumNew = new Aquarium("   ",44);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIfAquariumIsFull() {
        aquarium = new Aquarium("Water", 0);
        aquarium.add(fish);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIfCapacityIsCorrect() {
        aquarium = new Aquarium("Water", -2);
    }

    @Test
    public void checkCapacity() {
        aquarium = new Aquarium("Water", 2);
        Assert.assertEquals(2, aquarium.getCapacity());
    }

    @Test
    public void checkIfFishNameIsCorrect() {
        aquarium.add(fish);
        Assert.assertEquals("Nemo", fish.getName());
    }

    @Test
    public void checkIfFishIsRemoved() {
        aquarium.add(fish);
        aquarium.remove(fish.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIfFishWithThatNameExist() {
        fish = new Fish("Uno");
        aquarium.remove(fish.getName());
        Assert.assertEquals("Nemo", fish.getName());
    }

    @Test
    public void checkIfFishIsAddedCorrectly() {
        fish = new Fish("Uno");
        aquarium.add(fish);
        Assert.assertEquals("Uno", fish.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkSellFishIsInvalid() {
        aquarium.sellFish("Uno");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIfFishWithThatNameExistForSell() {
        fish = new Fish("Uno");
        aquarium.sellFish("Uno");
        Assert.assertEquals("Nemo", aquarium.sellFish("Uno"));
    }

    @Test
    public void checkIfAquariumNameIsCorrect() {
        aquarium = new Aquarium("Water", 30);
        Assert.assertEquals("Water", aquarium.getName());
    }

    @Test
    public void checkFishSize() {
        aquarium.getCount();
    }

    @Test
    public void sellFish() {
        aquarium.add(fish);
        aquarium.sellFish("Nemo");
        Assert.assertFalse(fish.isAvailable());
    }

    @Test(expected = IllegalArgumentException.class)
    public void sellFishIsInvalid() {
        aquarium.sellFish("dssadsa");
    }
    @Test
    public void checkIfFishIsAvailableInThatAquarium(){
        aquarium.report();
        String expected = "Nemo";
        Assert.assertEquals(expected,fish.getName());
    }
}

