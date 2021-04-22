package basic.dev;

import java.util.Scanner;

class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Tao thong tin Student
				String name;
				int id;
				int cmnd;
				String nameClass;
				String nameSchool;
				float dtb;
			Scanner scanner = new Scanner(System.in);
			    System.out.println("Nhập vào họ tên của sinh viên: ");
			    name = scanner.nextLine();
			    System.out.println("Nhập vào mã sinh viên: ");
			    id = scanner.nextInt();
			    System.out.println("Nhập vào chứng minh của sinh viên: ");
			    cmnd = scanner.nextInt();
		        System.out.println("Nhập vào tên lớp của sinh viên: ");
		        nameClass = scanner.nextLine();
		        System.out.println("Nhập vào tên trường của sinh viên: ");
		        nameSchool = scanner.nextLine();
		        System.out.println("Nhập vào điểm trung bình của sinh viên: ");
		        dtb = scanner.nextFloat();
		        System.out.println("Họ tên của sinh viên: " + name);
		        System.out.println("Mã sinh viên của sinh viên:  " + id);
		        System.out.println("Chứng minh của sinh viên: " + cmnd);
		        System.out.println("Tên lớp của sinh viên: " + nameClass);
		        System.out.println("Tên trường của sinh viên =  " + nameSchool);
		        System.out.println("ĐTB của sinh viên: " + dtb);
		  //Tao thong tin worker
		        String nameWorker;
				String address;
				String phone;
				float coefficient;
				System.out.println("Nhập vào tên công nhân: ");
			    nameWorker = scanner.nextLine();
			    System.out.println("Nhập vào địa chỉ: ");
			    address = scanner.nextLine();
			    System.out.println("Nhập vào số điện thoại công nhân: ");
			    phone = scanner.nextLine();
		        System.out.println("Nhập vào hệ số lương: ");
		        coefficient = scanner.nextFloat();
		        System.out.println("Họ tên công nhân: " + nameWorker);
		        System.out.println("SĐT của công nhân =  " + phone);
		        System.out.println("Địa chỉ: " + address);
		        System.out.println("Hệ số lương: "+ coefficient);
		  //Tao thong tin car
		        String nameCar;
				String nameManufacturer;
				float price;
				String color;
				System.out.println("Nhập vào tên xe: ");
			    nameCar = scanner.nextLine();
			    System.out.println("Nhập vào tên hãng: ");
			    nameManufacturer = scanner.nextLine();
			    System.out.println("Nhập vào giá: ");
			    price = scanner.nextFloat();
		        System.out.println("Nhập vào màu: ");
		        color = scanner.nextLine();
		        System.out.println("Tên xe: " + nameCar);
		        System.out.println("Tên hãng:  " + nameManufacturer);
		        System.out.println("Giá: " + price);
		        System.out.println("Màu: "+ color);
		   
	}

}
