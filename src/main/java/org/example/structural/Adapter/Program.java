package org.example.structural.Adapter;

public class Program {
    public void mainMethod() {
        String webhost = "HOST: https://google.com";
        WebService webService = new WebService(webhost);
        WebAdapter adapter = new WebAdapter();
        adapter.connect(webService);

        WebClient webClient = new WebClient(adapter);
        webClient.doWork();
    }
}
