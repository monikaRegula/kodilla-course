package com.kodilla.testing.forum.statictisc;

public class Calculate {

    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double meanPostForUser;
    private double meanCommentsForUser;
    private double meanCommentForPost;

    public void setUsersQuantity(int usersQuantity) { this.usersQuantity = usersQuantity; }

    public void setPostsQuantity(int postsQuantity) { this.postsQuantity = postsQuantity; }

    public void setCommentsQuantity(int commentsQuantity) { this.commentsQuantity = commentsQuantity; }

    public void setMeanPostForUser(double meanPostForUser) { this.meanPostForUser = meanPostForUser; }

    public void setMeanCommentsForUser(double meanCommentsForUser) { this.meanCommentsForUser = meanCommentsForUser; }

    public void setMeanCommentForPost(double meanCommentForPost) { this.meanCommentForPost = meanCommentForPost; }


    public int getUsersQuantity() { return usersQuantity; }

    public int getPostsQuantity() { return postsQuantity; }

    public int getCommentsQuantity() { return commentsQuantity; }

    public double getMeanPostForUser() { return meanPostForUser; }

    public double getMeanCommentsForUser() { return meanCommentsForUser; }

    public double getMeanCommentForPost() { return meanCommentForPost; }


    public void calculateAdvStatistics(Statistics statistics) {

try{
    setCommentsQuantity(statistics.commentsCount());
    setUsersQuantity(statistics.usersNames().size());
    setPostsQuantity(statistics.postsCount());

    setMeanPostForUser((double)postsQuantity/usersQuantity);
    setMeanCommentsForUser((double)usersQuantity/commentsQuantity);
    setMeanCommentForPost((double)commentsQuantity/postsQuantity);
}catch(ArithmeticException e){
    System.out.println("IMPOSSIBLE dzielonko przez zero było");
}

    }


    public String showStatistics(){
        return "Users quantity="+usersQuantity + " Posts quantity="+postsQuantity + "Comments quantity="+commentsQuantity
                +"\n"+"Post per user="+meanPostForUser + " Comment per user="+meanCommentsForUser + " Comment per post="+meanCommentForPost;
    }
}
