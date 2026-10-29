class ParkingSystem {
    int bigCarSpace;
    int mediumCarSpace;
    int smallCarSpace;
    public ParkingSystem(int big, int medium, int small) {
        bigCarSpace=big;
        mediumCarSpace=medium;
        smallCarSpace=small;
    }
    
    public boolean addCar(int carType) {
        if(carType==1 && bigCarSpace>0){
            bigCarSpace--;
            return true;
        }
        else if(carType==2 && mediumCarSpace>0){
            mediumCarSpace--;
            return true;
        }
        else if(carType==3 && smallCarSpace>0){
            smallCarSpace--;
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */