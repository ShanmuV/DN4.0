package DigitalNurture;

/**
 * Hello world!
 *
 */
public class App 
{
    ExternalAPI api;
    public App(ExternalAPI api){
        this.api = api;
    }

    public String getFormattedData(){
        String data = api.getData();
        return "Some Formatted Data: "+data;
    }
}

class ExternalAPI{
    public String getData(){
        return "Some data";
    }
}
