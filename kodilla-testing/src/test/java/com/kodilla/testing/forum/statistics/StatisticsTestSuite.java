package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statictisc.Calculate;
import com.kodilla.testing.forum.statictisc.Statistics;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.stubbing.OngoingStubbing;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {


    //liczba postow 0
    @Test
    public void testCalculateStatisticsWhenZeroPost() {
        //given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> mockList = new ArrayList<>();
        mockList.add("wha");

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(mockList);

        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistics(statisticsMock);

        int postQuantity = calculate.getPostsQuantity();
        double meanPostPerUser= calculate.getMeanPostForUser();

        Assert.assertEquals(0,postQuantity);
        Assert.assertEquals(0,meanPostPerUser,0.001);

    }


        //liczba postów 1000
    @Test
    public void testCalculateStatisticsWhen1000Post() {
        //given
        Statistics statisticsMock = mock(Statistics.class);

         when(statisticsMock.postsCount()).thenReturn(1000);

        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistics(statisticsMock);

       int postsQuantity = calculate.getPostsQuantity();
        Assert.assertEquals(1000,postsQuantity);

    }

//gdy liczba komentarzy 0
    @Test
    public void testCalculateStatisticsWhenZeroComments(){
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.commentsCount()).thenReturn(0);

        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistics(statisticsMock);
        int commentsQuantity = calculate.getCommentsQuantity();

        Assert.assertEquals(0,commentsQuantity);
    }


    //gdy liczba komentarzy < liczba postów
    @Test
    public void testCalculateStatisticsWhenCommentsLessThanPosts(){
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(200);

        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistics(statisticsMock);

        double mean = calculate.getMeanCommentForPost();
        Assert.assertEquals(0.5,mean,0.00000001);

    }


    //gdy liczba komentarzy > liczba postów
    @Test
    public void testCalculateStatisticsWhenCommentsMoreThanPosts(){
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.commentsCount()).thenReturn(200);
        when(statisticsMock.postsCount()).thenReturn(100);

        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistics(statisticsMock);

        double mean = calculate.getMeanCommentForPost();
        Assert.assertEquals(2,mean,0.00000001);

    }

    //gdy liczba użytkowników = 0
    @Test
    public void testCalculateStatisticsWhenZeroUsers(){
        Statistics statisticsMock = mock(Statistics.class);

        List<String> mockList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(mockList);

        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistics(statisticsMock);

        int usersQuantity= statisticsMock.usersNames().size();
        Assert.assertEquals(0,usersQuantity);
    }


    //gdy liczba użytkowników = 100
    @Test
    public void testCalculateStatisticsWhenHundredUsers(){
        Statistics statisticsMock = mock(Statistics.class);
        List<String> mockList = new ArrayList<>();

        for (int i=0;i<100;i++) {
            mockList.add("whatever");
        }

        when(statisticsMock.usersNames()).thenReturn(mockList);

        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistics(statisticsMock);

        int usersQuantity= statisticsMock.usersNames().size();
        Assert.assertEquals(100,usersQuantity);

    }
}
