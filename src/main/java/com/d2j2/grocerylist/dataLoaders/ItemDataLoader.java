package com.d2j2.grocerylist.dataLoaders;

import com.d2j2.grocerylist.entities.Item;
import com.d2j2.grocerylist.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ItemDataLoader implements CommandLineRunner {

    @Autowired
    ItemRepository itemRepository;

    @Override
    public void run(String... args) throws Exception {

        Item anItem = new Item();
        anItem.setProductName("Eggs");
        anItem.setUnit("12 Dozen");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("French Bread");
        anItem.setUnit("1 Loaf");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Wonder Bread");
        anItem.setUnit("16 Sliced Loaf");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Cheddar Cheese");
        anItem.setUnit("8 oz. block");

        itemRepository.save(anItem);
        anItem = new Item();
        anItem.setProductName("Pepper Jack Cheese");
        anItem.setUnit("6 oz shredded");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Land O Lakes Butter");
        anItem.setUnit("4 sticks");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Greek Yogart");
        anItem.setUnit("4 oz");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Yoplay Yogart");
        anItem.setUnit("6 oz");
        itemRepository.save(anItem);


        anItem = new Item();
        anItem.setProductName("Coke Soda");
        anItem.setUnit("6 pack");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Store Brand Cola");
        anItem.setUnit("2 liter");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Dear Park Water");
        anItem.setUnit("1 gallon");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Romaine Lettuce");
        anItem.setUnit("3 heads");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Kale");
        anItem.setUnit("2 lb bag");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Watermelon");
        anItem.setUnit("1 personal");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Honeydew Melon");
        anItem.setUnit("1 personal");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Sunkist Oranges");
        anItem.setUnit("5 lb bag");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Onions");
        anItem.setUnit("3 lb bag");

        itemRepository.save(anItem);
        anItem = new Item();
        anItem.setProductName("Roma Tomatoes");
        anItem.setUnit("4 per vine");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Old El Paso Taco shells");
        anItem.setUnit("10 count box");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Doritos Chips");
        anItem.setUnit("32 oz");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("UTZ Potato Chips");
        anItem.setUnit("20 oz");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Henz Ketchup");
        anItem.setUnit("20 oz");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Store Brand Mustard");
        anItem.setUnit("12 oz");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Chicken Beast");
        anItem.setUnit("3 breast pack");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Hamburger Patties, ground beef");
        anItem.setUnit("12 count");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Ribeye Steak");
        anItem.setUnit("2 - 8 oz pieces");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("White Cloud Toilet Paper");
        anItem.setUnit("8 pack megarolls");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Bounty Paper Towel");
        anItem.setUnit("3 rolls");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Mrs. Smith Apple Pie");
        anItem.setUnit("10 lb bag");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Beyer's Ice Cream");
        anItem.setUnit("1 pint");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Salmon, fish");
        anItem.setUnit("2 lb cuts");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Veggie Sausage");
        anItem.setUnit("4 pack");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Red Barron Pizza");
        anItem.setUnit("20 oz");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Little Debbie Cupcakes");
        anItem.setUnit("6 pack");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Almond Joy Candy");
        anItem.setUnit("8 oz bar");
        itemRepository.save(anItem);

        anItem = new Item();
        anItem.setProductName("Parboiled Rice");
        anItem.setUnit("5 lb bag");
        itemRepository.save(anItem);


    }
}
