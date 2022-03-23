package com.university.model.use;

public interface IUser {
    public String getUserFirstName();
    public void setUserFirstName(String userFirstName);
    public String getUserLastName();
    public void setUserLastName(String userLastName);
    public int getUserId();
    public void setUserId(int userId);
    public String getUserTitle();
    public void setUserTitle(String userTitle);
    public IType getUseType();
    public void setUseType(IType useType);
}
