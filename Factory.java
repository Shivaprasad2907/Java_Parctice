 class Bike {
		
		//Instances or non-static or non-static non-void object
		String engNum;
		String color;
		String ownerName;
		String bikeNum;
		
		//Constructor
		public Bike(String engNum, String color) {
			super();
			this.engNum = engNum;
			this.color = color;
		}

		
		 void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		 void setBikeNum(String bikeNum) {
			this.bikeNum = bikeNum;
		}
		
		void start() {
			System.out.println(ownerName + " Started Bike");
		}
		
		void move() {
			System.out.println(ownerName + " Moving on Bike");
		}
		
		void stop() {
			System.out.println(ownerName + " stopped Bike");
		}
 }
		
	public class Factory {
		public static void main(String[] args) {
			// Creating to instances Bike object 
			Bike pulsar = new  Bike("Eng15248kj1u", "red");
			Bike bullet = new Bike("Eng56482U1kj", "blke");
			
			//Setting remaining Properties Name and bike num
			pulsar.setBikeNum("TG 07 A 0010");
			pulsar.setOwnerName("nari");
			
			bullet.setOwnerName("shiva");
			bullet.setBikeNum("TG 05 0012");
			
			//performing operation on bike object
			bullet.start();
			bullet.move();
			bullet.stop();
			
		}
	}
		
		
	

	
	
