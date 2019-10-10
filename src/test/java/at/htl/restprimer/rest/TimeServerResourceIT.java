package at.htl.restprimer.rest;

import org.junit.Before;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class TimeServerResourceIT {

    private Client client;
    private Webtarget tut;

    @Before
    public void initClient(){
        this.client = ClientBuilder.newClient();
        this.tut = ((Client) this.client).target("")

    }
}
