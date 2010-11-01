/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.enapp.web;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

import javax.inject.Named;


/**
 *
 * @author nnussbaumer
 */
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

@Named("twitter")
@ApplicationScoped
public class TwitterBean {

    List<Status> tweetCache = null;
    Date lastFetched = null;
    final String REQUEST_TOKEN_URL = "http://api.twitter.com/oauth/request_token";

    public TwitterBean() {
    }

    public synchronized List<Status> getTweets() {

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, -5);
        Date forFiveMinutes = calendar.getTime();
        if (tweetCache != null && lastFetched != null && lastFetched.after(forFiveMinutes)) {
            return tweetCache;
        }

        Twitter unauthenticatedTwitter = new TwitterFactory().getInstance();

        try {
            tweetCache = unauthenticatedTwitter.getUserTimeline("HSLU_ENAPP");
            Calendar newCalendar = Calendar.getInstance();
            lastFetched = newCalendar.getTime();
            return tweetCache;

        } catch (TwitterException te) {
            return null;
        }
    }
}
