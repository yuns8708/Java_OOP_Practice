public class Taxi extends Car {
    // 목적지
    String destination;

    // 목적지까지 거리
    int distance;

    // 기본거리
    int basicDistance = 1;

    // 기본요금
//    int basicPrice = 3000;

    // 지불 요금
    int payPrice;

    // 총 요금
    int totalPrice;

    // 거리당요금
    int pricePerDistance = 1000;

    // 생성자
    public Taxi() {
        maxPassenger = 4;
        basicPrice = 3000;
        status = "일반";
        count ++;
        number = count;
    }

    // getter setter
    // 목적지 입력 / 가져오기
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    // 거리 입력 / 가져오기
    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    // 지불할 요금 계산
    public int getPayPrice() {
        payPrice = basicPrice + pricePerDistance * (distance - 1);
        return payPrice;
    }

    // 총합 요금 가져오기
    public int getTotalPrice() {
//        totalPrice += payPrice;
        return totalPrice;
    }

    // 요금 결제
    public void pay() {
        totalPrice += payPrice;
        System.out.println("결제 완료!!");
    }

    public int getPassenger() {
        return passenger;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    // 기본요금 가져오기
    public int getBasicPrice() {
        return basicPrice;
    }

    // 승객 탑승
    public void takePassenger(int passenger) {
        if (passenger <= maxPassenger) {
            this.passenger = passenger;
//            System.out.println("현재 승객 인원수는 : " + this.passengers);
        } else {
            System.out.println("인원을 초과합니다.");
        }
    }

    // 주유하기
    public void changeFuel(int fuel) {
        this.fuel += fuel;
        if (this.fuel < 10) {
            status = "운행불가";
        }
    }

}
