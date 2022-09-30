public class Bus extends Car {
//    int basicPrice = 1000;

    public Bus() {
        maxPassenger = 30;
        basicPrice = 1000;
        status = "운행중";
        count ++;
        number = count;
    }



    public int getPrice() {
        int price = passenger * basicPrice;
        return price;
    }

    public int getPassenger() {
        return passenger;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    // 승객 탑승
    public void takePassenger(int passenger) {
        if (status.equals("운행중")) {
            if (passenger <= maxPassenger) {
                this.passenger = passenger;
//            System.out.println("현재 승객 인원수는 : " + this.passengers);
            } else {
                System.out.println("인원을 초과합니다.");
            }
        } else {
            System.out.println("운행중이 아닙니다.");
        }
    }

    // 주유하기
    public void changeFuel (int fuel) {
        this.fuel += fuel;
        if(this.fuel < 10) {
            status = "차고지행";
        }
    }


}
