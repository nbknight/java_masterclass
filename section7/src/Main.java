public class Main {

    public static void main(String[] args) {
//		Dimensions dimensions = new Dimensions(20, 20, 5);
//		Case theCase = new Case("220B", "Dell", "240", dimensions);
//
//		Monitor theMonitor = new Monitor("27inch Bease", "Acer", 27, new Resolution(2540, 1440));
//
//		Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
//
//		PC thePC = new PC(theCase, theMonitor, theMotherboard);
//		thePC.powerUp();

//		Wall wall1 = new Wall("West");
//		Wall wall2 = new Wall("East");
//		Wall wall3 = new Wall("North");
//		Wall wall4 = new Wall("South");
//
//		Ceiling ceiling = new Ceiling(12, 55);
//
//		Bed bed = new Bed("Modern", 4, 3, 2, 1);
//
//		Lamp lamp = new Lamp("Classic", false, 75);
//
//		Bedroom bedroom = new Bedroom("Nicks", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
//
//		bedroom.makeBed();
//		bedroom.getLamp().turnOn();

//		Player player = new Player();
//		player.name = "Time";
//		player.health = 20;
//		player.weapon = "Sword";
//
//		int damage = 10;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());
//
//		damage = 11;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());

//		EnhancedPlayer player = new EnhancedPlayer("Nick", -6, "Sword");
//		System.out.println("Initial health is " + player.getHealth() + "%");

		Printer printer = new Printer(50,true);
		System.out.println(printer.addToner(50));
		System.out.println("initial page count = " +printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(4);
		System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " + printer.getPagesPrinted());
		pagesPrinted = printer.printPages(2);
		System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " + printer.getPagesPrinted());




	}
}
