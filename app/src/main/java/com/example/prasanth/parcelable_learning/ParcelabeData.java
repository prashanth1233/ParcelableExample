package com.example.prasanth.parcelable_learning;

import android.os.Parcel;
import android.os.Parcelable;



public class ParcelabeData implements Parcelable  {

    private String firstName;
    private String lastName;
    private String nickName;

    public void writeToParcel(Parcel out,int flags)
    {
        out.writeString(firstName);
        out.writeString(lastName);
        out.writeString(nickName);
    }
    public int describeContents()
    {
        return 0;
    }

    public static final Parcelable.Creator<ParcelabeData> CREATOR=new Parcelable.Creator<ParcelabeData>()
    {
        public ParcelabeData createFromParcel(Parcel in)
        {
        return new ParcelabeData(in);
        }

        public ParcelabeData[] newArray(int size)
        {
            return new ParcelabeData[size];
        }
    };
    private ParcelabeData(Parcel in)
    {
        firstName=in.readString();
        lastName=in.readString();
        nickName=in.readString();

    }
    public ParcelabeData(String name1, String name2, String name3)
    {
    this.firstName=name1;
        this.lastName=name2;
        this.nickName=name3;
    }
    public String getName1()
    {
        return firstName;
    }
    public String getName2()
    {
        return lastName;
    }

    public String getName3()
    {
        return nickName;
    }


}
