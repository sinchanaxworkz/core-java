class SuperMarket{
  public static void main(String dMart[]){
  System.out.println("Main Started");
  String groceries[] = {"Dal","Rice","Wheat","Ragi","GoldWinnerSunfloweroil","Fortune Sunflower oil","Grean Peas","MoongDal","Idli and Dosa Batter","Fortune Fresh Atta","Ashirwad Whole Wheat Atta","Prasadam Makhana","Toor Dal","Premium Leaf Tea","Chai Powder"};
  String vegetables[] = {"Onion","Beans","Ladies Finger","Potato","Pumpkin","Pea","Spinach","Squash","Raddish","Corn","Ginger","Corriander","Leek","Taro","Lettuce"};
  String fruits[] = {"Apple","Banana","WaterMelon","MuskMelon","Orange","Grapes","Sappota","DragonFruit","Pineapple","Mango","Papaya","Cherry","Kiwi","JackFruit","Strawberry"};
  String perfumes[] = {"Hungary water","Carmelite Water","Enchanted Elixir","Midnight Mystique","Whispering Woods","Serene Oasis","Velvet Petals","Celestial Harmony","Moonlit Mirage","Secret Garden","Eternal Embrace","Ocean Breeze","Ocean Breeze","Starry Night","Radiant Aura"};
  String snacks[] = {"Popcorn","Potato Chips","Pretzels","Mixed Nuts","Fruit Salad","Granola Bars","Trail Mix","Rice Cakes","Cheese and Crackers","Yogurt Parfait"};
  String chocalates[] = {"Milk Chocolate Bar","Dark Chocolate Bar","White Chocolate Bar","Hazelnut Chocolate Bar","Caramel-filled Chocolate","Almond Chocolate Bar","Peanut Butter Cup","Mint Chocolate","Coconut Chocolate","Espresso Chocolate","Truffle Assortment","Cherry Chocolate","Macadamia Nut Chocolate","Raspberry-filled Chocolate","Sea Salt Chocolate"};
  String homeAppliances[] = {"Refrigerator","Washing Machine","Dishwasher","Oven","Microwave Oven","Coffee Maker","Blender","Toaster","Food Processor","Air Fryer","Slow Cooker","Electric Kettle","Stand Mixer","Vacuum Cleaner","Iron","Hair Dryer","Air Purifier","Water Dispenser","Bread Maker","Electric Grill"};
  String cosmetics[]= {"Matte Liquid Lipstick","BB Cream","Highlighter Palette","Eyeshadow Palette","Foundation Stick","Setting Spray","Contour Kit","Mascara Primer","Eyebrow Pomade","Gel Eyeliner","Lip Gloss","Blush Palette","Nail Polish","Creamy Concealer","Setting Powder"};
  String alcohols[] = {"Whiskey","Vodka","Rum","Gin","Tequila","Brandy","Scotch","Bourbon","Beer","Wine","Sake","Champagne","Prosecco","Cognac","Margarita"};
  String milkProducts[] = {"Butter","Yogurt","Cheese","Cream","Cottage Cheese","Ghee","Milk Powder","Paneer","Sour Cream","Buttermilk"};
  String coolDrinks[] = {"Lemonade","Iced Tea","Fruit Punch","Strawberry Lemonade","Mango Lassi","Orange Juice","Cranberry Spritzer","Raspberry Lemonade","Peach Iced Tea","Cherry Limeade","Blueberry Lemonade","Passionfruit Fizz","Pomegranate Lemonade","Green Tea Mojito","Grapefruit Sparkler"};
  String icecreams[] = {"Vanilla Bean","Chocolate Fudge Brownie","Strawberry Cheesecake","Cookies and Cream","Rocky Road","Butter Pecan","Coffee Caramel Crunch","Pistachio Almond","Salted Caramel","Coconut Pineapple","Maple Walnut","Cookie Dough","Mango Tango","Blueberry Cheesecake","Hazelnut Praline"}; 
 // System.out.println("List of Groceries are : " + groceries[0] + "\n" + groceries[1] + "\n" + groceries[2] + "\n" + groceries[3] + "\n" + groceries[4] + "\n" + groceries[5] + "\n" + groceries[6] + "\n" + groceries[7] + "\n" + groceries[8] + "\n" + groceries[9] + "\n" + groceries[10] + "\n" + groceries[11] + "\n" + groceries[12] + "\n" + groceries[13] + "\n" + groceries[14]);
  //System.out.println("List of Vegetables are : " + vegetables[0] + "\n" + vegetables[1] + "\n" + vegetables[2] + "\n" + vegetables[3] + "\n" + vegetables[4] + "\n" + vegetables[5] + "\n" + vegetables[6] + "\n" + vegetables[7] + "\n" + vegetables[8] + "\n" + vegetables[9] + "\n" + vegetables[10] + "\n" + vegetables[11] + "\n" + vegetables[12] + "\n" + vegetables[13] + "\n" + vegetables[14]);
 // System.out.println("List of Fruits are : " + fruits[0] + "\n" + fruits[1] + "\n" + fruits[2] + "\n" + fruits[3] + "\n" + fruits[4] + "\n" + fruits[5] + "\n" + fruits[6] + "\n" + fruits[7] + "\n" + fruits[8] + "\n" + fruits[9] + "\n" + fruits[10] + "\n" + fruits[11] + "\n" + fruits[12] + "\n" + fruits[13] + "\n" + fruits[14]);
 // System.out.println("List of Perfumes are : " + perfumes[0] + "\n" + perfumes[1] + "\n" + perfumes[2] + "\n" + perfumes[3] + "\n" + perfumes[4] + "\n" + perfumes[5] + "\n" + perfumes[6] + "\n" + perfumes[7] + "\n" + perfumes[8] + "\n" + perfumes[9] + "\n" + perfumes[10] + "\n" + perfumes[11] + "\n" + perfumes[12] + "\n" + perfumes[13] + "\n" + perfumes[14]);
 // System.out.println("List of snacks are : " + snacks[0] + "\n" + snacks[1] + "\n" + snacks[2] + "\n" + snacks[3] + "\n" + snacks[4] + "\n" + snacks[5] + "\n" + snacks[6] + "\n" + snacks[7] + "\n" + snacks[8] + "\n" + snacks[9]);
//  System.out.println("List of Chocalates are : " + chocalate[0] + "\n" + chocalate[1] + "\n" + chocalate[2] + "\n" + chocalate[3] + "\n" + chocalate[4] + "\n" + chocalate[5] + "\n" + chocalate[6] + "\n" + chocalate[7] + "\n" + chocalate[8] + "\n" + chocalate[9] + "\n" + chocalate[10] + "\n" + chocalate[11] + "\n" + chocalate[12] + "\n" + chocalate[13] + "\n" + chocalate[14]);
 // System.out.println("List of homeAppliances are : " + homeAppliances[0] + "\n" + homeAppliances[1] + "\n" + homeAppliances[2] + "\n" + homeAppliances[3] + "\n" + homeAppliances[4] + "\n" + homeAppliances[5] + "\n" + homeAppliances[6] + "\n" + homeAppliances[7] + "\n" + homeAppliances[8] + "\n" + homeAppliances[9] + "\n" + homeAppliances[10] + "\n" + homeAppliances[11] + "\n" + homeAppliances[12] + "\n" + homeAppliances[13] + "\n" + homeAppliances[14] + "\n" + homeAppliances[15] + "\n" + homeAppliances[16] + "\n" + homeAppliances[17] + "\n" + homeAppliances[18] + "\n" + homeAppliances[19]);
 // System.out.println("List of cosmetics are : " + cosmetics[0] + "\n" + cosmetics[1] + "\n" + cosmetics[2] + "\n" + cosmetics[3] + "\n" + cosmetics[4] + "\n" + cosmetics[5] + "\n" + cosmetics[6] + "\n" + cosmetics[7] + "\n" + cosmetics[8] + "\n" + cosmetics[9] + "\n" + cosmetics[10] + "\n" + cosmetics[11] + "\n" + cosmetics[12] + "\n" + cosmetics[13] + "\n" + cosmetics[14]);
 // System.out.println("List of alchohols are : " + alcohols[0] + "\n" + alcohols[1] + "\n" + alcohols[2] + "\n" + alcohols[3] + "\n" + alcohols[4] + "\n" + alcohols[5] + "\n" + alcohols[6] + "\n" + alcohols[7] + "\n" + alcohols[8] + "\n" + alcohols[9] + "\n" + alcohols[10] + "\n" + alcohols[11] + "\n" + alcohols[12] + "\n" + alcohols[13] + "\n" + alcohols[14]);
 // System.out.println("List of milk products are : " + milkProducts[0] + "\n" + milkProducts[1] + "\n" + milkProducts[2] + "\n" + milkProducts[3] + "\n" + milkProducts[4] + "\n" + milkProducts[5] + "\n" + milkProducts[6] + "\n" + milkProducts[7] + "\n" + milkProducts[8] + "\n" + milkProducts[9]);
 // System.out.println("List of cool drinks are : " + cooldrinks[0] + "," + cooldrinks[1] + "," + cooldrinks[2] + "," + cooldrinks[3] + "," + cooldrinks[4] + "," + cooldrinks[5] + "," + cooldrinks[6] + "," + cooldrinks[7] + "," + cooldrinks[8] + "," + cooldrinks[9] + "," + cooldrinks[10] + "," + cooldrinks[11] + "," + cooldrinks[12] + "," + cooldrinks[13] + "," + cooldrinks[14]);
 // System.out.println("List of Ice creams are : " + icecream[0] + "\n" + icecream[1] + "\n" + icecream[2] + "\n" + icecream[3] + "\n" + icecream[4] + "\n" + icecream[5] + "\n" + icecream[6] + "\n" + icecream[7] + "\n" + icecream[8] + "\n" + icecream[9] + "\n" + icecream[10] + "\n" + icecream[11] + "\n" + icecream[12] + "\n" + icecream[13] + "\n" + icecream[14]);
  for(String grocery:groceries){
	  System.out.println("groecery");
  }
  for(String vegetable:vegetables){
  System.out.println("vegetable");
  }
  for(String fruit:fruits){
	  System.out.println("fruit");
  }
  for(String perfume:perfumes){
  System.out.println("perfume");
  }
  for(String snack:snacks){
  System.out.println("snack");
  }
  for(String chocalate:chocalates){
  System.out.println("chocalate");
  }
  for(String homeAppliance:homeAppliances){
	  System.out.println("homeAppliance");
  }
  for(String cosmetic:cosmetics){
  System.out.println("cosmetic");
  }
  for(String alcohol:alcohols){
	  System.out.println("alcohol");
  }
  for(String milkProduct:milkProducts){
  System.out.println("milkProduct");
  }
  for(String coolDrink:coolDrinks){
	  System.out.println("coolDrink");
  }
  for(String icecream:icecreams){
  System.out.println("icecream");
  }
  System.out.println("Main Ended");
  }
}