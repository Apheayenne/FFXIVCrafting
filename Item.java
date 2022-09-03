
class Item{
    
    Array<String> job;
    int amountCreated;
    
    
    Item(Array[] job, int amountCreated){
        this.job = job;
        this.amountCreated = amountCreated;
    }

    public Item getItem(){
        return this.Item;
    }

    public Array[] getJob(){
        return job;
    }
    public void setJob(Array[] job){
        this.job = job;
    }
    public int getAmountCreated(){
        return amountCreated;
    }
    public void setAmountCreated(int amountCreated){
        this.amountCreated = amountCreated;
    }
}