package shopAndGoods;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class ShopTest {
    private Shop shop;
    private Goods goods1;
    private Goods goods2;

    @Before
    public void setUp() {
        shop = new Shop();
        goods1 = new Goods("PC", "12");
        goods2 = new Goods("Laptop", "13");
    }

    @Test(expected = IllegalArgumentException.class)
    public void addGoodToNotExistingShelve() throws OperationNotSupportedException {
        shop.addGoods("shelf", goods1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIfShelveIsAlreadyTaken() throws OperationNotSupportedException {
        shop.addGoods("Shelves1", goods1);
        shop.addGoods("Shelves1", goods2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkIfGoodIsAlreadyExistInTheShelve() throws OperationNotSupportedException {
        shop.addGoods("Shelves1", goods1);
        shop.addGoods("Shelves1", goods1);
    }

    @Test
    public void checkIfAddGoodIsWithCorrectName() {
        goods1 = new Goods("PC", "12");
        Assert.assertEquals("PC", goods1.getName());
    }

    @Test
    public void checkIfGoodIsWithCorrectCode() {
        goods1 = new Goods("PC", "12");
        Assert.assertEquals("12", goods1.getGoodsCode());
    }

    @Test
    public void testIsTrueAdd() throws OperationNotSupportedException {
        String expected = "Goods: 12 is placed successfully!";
        String actual = this.shop.addGoods("Shelves1", goods1);
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(goods1, this.shop.getShelves().get("Shelves1"));
    }


    @Test(expected = IllegalArgumentException.class)
    public void removeGoodFromNotExistingShelve() throws OperationNotSupportedException {
        shop.removeGoods("shelf", goods1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void removedGoodAreNotExist() throws OperationNotSupportedException {
        shop.removeGoods("Shelves1", goods1);
        shop.removeGoods("Shelves1", goods1);
    }

    @Test
    public void goodIsRemovedSuccessfully() throws OperationNotSupportedException {
        shop.addGoods("Shelves1", goods1);
        shop.removeGoods("Shelves1", goods1);
    }

    @Test
    public void testIsTrueRemove() throws OperationNotSupportedException {
        String expected = "Goods: 12 is removed successfully!";
        this.shop.addGoods("Shelves1", goods1);
        String actual = this.shop.removeGoods("Shelves1", goods1);
        Assert.assertEquals(expected, actual);
        Assert.assertNull(this.shop.getShelves().get("Shelves1"));
    }
}