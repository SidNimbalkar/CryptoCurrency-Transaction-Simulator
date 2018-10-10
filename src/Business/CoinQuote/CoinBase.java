package Business.CoinQuote;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.swing.*;

import Business.CoinQuote.Coin;


public class CoinBase implements DataProvide, Runnable {

    static JTable table;
    private String str;
    private Coin coin;
    public CoinBase() {

    }

    public void startProcess(JTable tab) {
        table = tab;

        Thread coinbase = new Thread(new CoinBase());
        coinbase.start();
    }

    public void run() {
        

        String url = "https://api.coinbase.com/v2/prices/spot";
        MyHTTPRequest http = new MyHTTPRequest();
        while (true) {
            try {

                String response = http.doRequest(url);

                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                Reply reply = gson.fromJson(response, Reply.class);
          //      reply.getData().getAmount()

                coin.setCoin(reply.getData().getAmount());
                

                Thread.sleep(60000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    
    
    
    
    public class Reply
    {
        Data data;

        private Warnings[] warnings;

        public Data getData ()
        {
            return data;
        }

    }


    public class Data {
        private String amount;

        private String currency;

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        @Override
        public String toString() {
            return "ClassPojo [amount = " + amount + ", currency = " + currency + "]";
        }
    }

    public class Warnings {
        private String message;

        private String id;

        private String url;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        @Override
        public String toString() {
            return "ClassPojo [message = " + message + ", id = " + id + ", url = " + url + "]";
        }
    }
}
