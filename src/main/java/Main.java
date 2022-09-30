public class Main {
    public static void main(String[] args) {


        // 1. 2대 생성
        Bus b1 = new Bus();
        Bus b2 = new Bus();
        // 2. 번호 확인
        System.out.println("b1의 번호 : " + b1.number);
        System.out.println("b2의 번호 : " + b2.number);

        System.out.println("-------------------");
        // 1. 승객 +2
        b1.takePassenger(2);

        // 2. 출력
        System.out.println("b1의 탑승 승객 수 : " + (b1.getPassenger()));
        System.out.println("b1의 잔여 승객 수 : " + (b1.getMaxPassenger() - b1.getPassenger()));
        System.out.println("b1의 요금 : " + b1.getPrice());
        System.out.println("-------------------");

        // 3. 주유량 -50
        b1.changeFuel(-50);
        // 4. 출력
        System.out.println("주유량은 : " + b1.getFuel());
        System.out.println("-------------------");

        // 5. 상태 변경
        b1.changeStatus();
        // 6. 주유량 +10
        b1.changeFuel(10);
        // 7. 출력 : 상태=차고지행, 주유량=60
        System.out.println("상태는 : " + b1.status);
        System.out.println("주유량은 : " + b1.fuel);
        System.out.println("-------------------");

        // 8. 상태 변경
        b1.changeStatus();
        // 9. 승객 +45
        b1.takePassenger(45);

        // 11. 승객 +5
        b1.takePassenger(5);
        // 12. 출력 : 승객수=5, 잔여승객수=25, 요금=5000
        System.out.println("b1의 탑승 승객 수 : " + (b1.getPassenger()));
        System.out.println("b1의 잔여 승객 수 : " + (b1.getMaxPassenger() - b1.getPassenger()));
        System.out.println("b1의 요금 : " + b1.getPrice());
        System.out.println("-------------------");

        // 13. 주유량-55
        b1.changeFuel(-55);
        // 14.출력 : 주유량:5, 상태:차고지행
        System.out.println("상태는 : " + b1.status);
        System.out.println("주유량은 : " + b1.fuel);


        System.out.println("-------------------");
        System.out.println("-------------------");
        System.out.println("Taxi");
        // 1. Taxi 2대 생성
        Taxi t1 = new Taxi();
        Taxi t2 = new Taxi();

        // 2. 출력 : 번호확인, 주유량, 상태
        System.out.println("t1의 번호 : " + t1.number);
        System.out.println("t2의 번호 : " + t2.number);
        System.out.println("상태는 : " + t1.getStatus());
        System.out.println("주유량은 : " + t1.getFuel());
        System.out.println("-------------------");

        // 1. 승객 +2, 목적지=서울역, 목적지까지 거리=2km
        t1.takePassenger(2);
        t1.setDestination("서울역");
        t1.setDistance(2);

        // 2. 출력 : 탑승 승객 수, 잔여 승객 수, 기본 요금 확인
        System.out.println("t1의 탑승 승객 수 : " + (t1.getPassenger()));
        System.out.println("t1의 잔여 승객 수 : " + (t1.getMaxPassenger() - t1.getPassenger()));
        System.out.println("t1의 기본 요금 : " + t1.getBasicPrice());

        // 출력 : 목적지, 목적지까지 거리, 지불할 요금, 상태
        System.out.println("t1의 목적지 : " + (t1.getDestination()));
        System.out.println("t1의 목적지까지의 거리 : " + (t1.getDistance()));
        System.out.println("지불할 요금 : " + t1.getPayPrice());
        System.out.println("상태 : " + t1.getStatus());
        System.out.println("-------------------");

        // 3. 주유량 -80
        t1.changeFuel(-80);

        // 4. 요금 결제
        t1.pay();

        // 5. 출력 : 주유량, 누적 요금
        System.out.println("주유량은 : " + t1.getFuel());
        System.out.println("누적요금은 : " + t1.getTotalPrice());
        System.out.println("-------------------");

        // 6. 승객+5
        // 7. 알럿 '최대 승객 수 초과'
        t1.takePassenger(5);
        System.out.println("-------------------");

        // 8. 승객+3, 목적지=구로디지털단지역, 목적지까지 거리=12km
        t1.takePassenger(3);
        t1.setDestination("구로디지털단지역");
        t1.setDistance(12);
        
        // 9. 출력 : 탑승 승객수, 잔여승객수, 기본요금
        System.out.println("t1의 탑승 승객 수 : " + (t1.getPassenger()));
        System.out.println("t1의 잔여 승객 수 : " + (t1.getMaxPassenger() - t1.getPassenger()));
        System.out.println("t1의 기본 요금 : " + t1.getBasicPrice());
        
        // 목적지, 목적지까지 거리, 지불할 요금
        System.out.println("t1의 목적지 : " + (t1.getDestination()));
        System.out.println("t1의 목적지까지의 거리 : " + (t1.getDistance()));
        System.out.println("지불할 요금 : " + t1.getPayPrice());
        System.out.println("-------------------");

        // 10. 주유량 -20
        t1.changeFuel(-20);

        // 11. 결제
        t1.pay();

        // 12. 출력 : 주유량=0, 상태=운행불가, 누적요금=19000
        System.out.println("주유량은 : " + t1.getFuel());
        System.out.println("상태는 : " + t1.getStatus());
        System.out.println("누적요금은 : " + t1.getTotalPrice());


    }
}
