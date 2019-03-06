package rocks.zipcode.io.itemsorter;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.ItemSorter;
import rocks.zipcode.io.comparators.NameComparator;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class SortByPriceTest {

    @Test
    public void priceTest() {
        // given
        Item item3 = new Item(0L, "Butter knife", 1.20);
        Item item2 = new Item(1L, "Kitchen knife", 5.50);
        Item item1 = new Item(2L, "Chef's knife", 18.0);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item3, item2, item1};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        //then
        Assert.assertArrayEquals(expected, actual);


    }

    @Test
    public void priceTest2() {
        // given
        Item item3 = new Item(0L, "Brown Rice", 5.40);
        Item item2 = new Item(1L, "Bulgar", 8.10);
        Item item1 = new Item(2L, "Quinoa", 10.0);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item3, item2, item1};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        //then
        Assert.assertArrayEquals(expected, actual);


    }

    @Test
    public void priceTest3() {
        // given
        Item item3 = new Item(0L, "Jordan", 5.40);
        Item item2 = new Item(1L, "Jackson", 8.10);
        Item item1 = new Item(2L, "Tyson", 10.0);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item3, item2, item1};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        //then
        Assert.assertArrayEquals(expected, actual);


    }
}
