package studio.aplaudo.com.hn.interfaces;

import studio.aplaudo.com.hn.model.Venue;

/**
 * Created by CortesMoncada on 17/03/2015.
 * Interface used to communicate the click parent fragment lis with detail fragment.
 */
public interface Communicator {

    public void sendVenue(Venue venue);

}
