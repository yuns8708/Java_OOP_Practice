public class Car {
    // 카운트 횟수
    static int count;
    // 차량번호
    int number;

    // 기본요금
    int basicPrice;

    // 주유량
    int fuel = 100;

    // 속도
    int speed = 0;

    // 속도변경
    int changeSpeed;

    // 최대 승객 수
    int maxPassenger;

    // 현재 승객 수
    int passenger;

    // 상태
    String status;

    // getter
    public int getCarNumber() {
        return number;
    }

    public int getFuel() {
        if(this.fuel < 10) {
            System.out.println("주유가 필요합니다.");
        }
        return fuel;
    }

    public String getStatus() {
        return status;
    }


    //////// 기능 (메소드)

    // 운행 시작
    public void drive() {
        if (fuel < 10) {
            System.out.println("운행 불가. 주유량을 확인하세요.");
        } else {
            System.out.println("운행을 시작합니다.");
            status = "운행중";
        }

    }

    // 상태 변경
    public void changeStatus() {
        if (status.equals("운행중")) {
            status = "차고지행";
        } else {
            status = "운행중";
        }

    }

//    // 주유하기
//    public void changeFuel (int fuel) {
//        this.fuel += fuel;
//        if(this.fuel < 10) {
//            status = "차고지행";
//        }
//    }

    // 승객 탑승
//    public int getPassenger(int passenger) {
//        if (passenger <= this.maxPassenger) {
////            maxPassenger -= passengers;
//            this.passenger = this.maxPassenger - passenger;
////            System.out.println("현재 승객 인원수는 : " + this.passengers);
//        } else {
//            System.out.println("인원을 초과합니다.");
//        }
//
//        return passenger;
//    }

    // 속도 높이기
    public void speedUp(int speed) {
        if (fuel < 10) {
            System.out.println("주유량이 10 이상이어야합니다.");
        } else {
            this.speed += speed;
        }
    }

    // 속도 내리기
    public void speedDown(int speed) {
        if (fuel < 10) {
            System.out.println("주유량이 10 이상이어야합니다.");
        } else {
            this.speed -= speed;
        }
    }

}
