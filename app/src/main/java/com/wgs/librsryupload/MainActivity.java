package com.wgs.librsryupload;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.wgs.calulationlibrary.Calculus;


public class MainActivity extends AppCompatActivity {
    private Calculus calculus;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculus=new Calculus(10,5);
        text=(TextView) findViewById(R.id.textview);
        text.setText(String.valueOf(calculus.getMultiplyData()));

        String text = "lQdGBGJB2UEBEAC8JSgTqdQmKpcVx0QuVVH1lDmj+SLo1SPh076t4TG/0V/HcmPD\n" +
                "DHN6kqFiAf4dabHnrbbkL+XcEoHaAbnRdeSC8EcpSVXIEx5c8PmaeFACMziisz3y\n" +
                "ajO6MJLD3TY/6E3uxDVDcYWtM9RKgMwT05bZRyTygDYxu8YG6bl3xfsicuR8QpnB\n" +
                "wPihFp5TsAxzw5o7H7DVH2MSfxaHqDoqmSLZBPPr0yJ/01n0HQ2VxkQi3BcvJQ5x\n" +
                "mTxJCnWecgiZq+l9g7h1sFzYWoBPWYyz90bND1oNLuzpxwG1sB6p3R3sE7Wz8pC0\n" +
                "mBhMUOJ6Gqu7tkju0naUDe2n67Eftvzulpb9LDaQlGwBCxHS0YNGQ2LrulOxH+Uu\n" +
                "v5ik7WjTk885ouchL+LeZagQd/hIF1rGb45Uz7FE3cg2P8e2jFPeoQJaUPx/zaHN\n" +
                "T0+gSjiB3kmQfz+CDtw/rqz9JWbtHfsYgY7go7avxl2sV1ygIZ5c61iMT5Dn3fLu\n" +
                "HHylCL9wYAfaTzE9pHxyA8tr1nXr8PMvzqSDV6coS43gYOsPyhD/MKYbxGgc0FK1\n" +
                "0ye1szschMvsq3XhU27WxPVHog8O1HLr1eaQzmqfoMsqQcIcIJk7LYMZzXLM2uSb\n" +
                "wI9C+XaTJzd6dLfr+g87KtQZGfA50CZBRX2AmMKFh/aeTvbuJYGS+oCz3wARAQAB\n" +
                "/gcDAgm5h8bLMB2T9nA3oE9hDeYc39FOD3EFNCgGPSM/kKDIWZwlkwhnetT5zd79\n" +
                "vkQQIeGqA/k7JSj/OW8rKjA9HSt0M2/XJS1cJX5TkHl/EM8w6U59XKsgCj/EDrc7\n" +
                "6X1UJ2sc26N1+xR4ZMlYj7QJqiyEWVM9sBboImH70H2zPSEVaPCmkuXOCDiSo2hj\n" +
                "hGarhbZz4sejvm+UcXit5VVKJoDwe6LNA9L/g0a32PRJvW8qHm2bpp+nePOSU+8G\n" +
                "jO08owgL09+IcXqcZs9LdwktkLnFtjS2QEwM9ir1GzUShoQ8sWz1Eq3sxpPHw7xm\n" +
                "AJVng4Czv3elfCe8iWtypYIGuzBPFN94kvjwN4h8nSMKF8SYLROqB21e/mkiLcLw\n" +
                "P7Ppz80+be8xn02TWM/Bp2Fn7z3YZCYDdCYsuRx76GFgbFX1z7ySMHzBDNDOt85I\n" +
                "AfdHgkBK2umTHGyznLZfP1z/Gwls/wOV2ikvwvM8hbg00sNl46VVyHUp0GDf7s+E\n" +
                "7KSBb/MvkEOJXvBhCXSLMe5g8C01mDUHi5FUYbQeyodQDpZDjA3y9/58Xu6UrylA\n" +
                "CjBqxd3P32Brz74om2X1d1BE2C2xqVmbxAAD7aIBFByu1W/bh7lLZlKw+hT22yfB\n" +
                "bdxLebXqGYSq8okN0zsaiw1BhJcN0M4KB5eQtfgECgieXgGdsEKttMSOaP5xgkqd\n" +
                "EuNaBaiy4IR/0U6oFaAH6kzbGmIt4YiNpXgbKz5shO+7r66zAvIIx4whJG7zPNlW\n" +
                "ua8VCmmQIxOlSuw7WnY0Cfi4xjyIMr/CpuNW6k9GsWU57Bd30nYqZQ9Z7ZOq9Tk2\n" +
                "egGJ06pdofGAU23UbcKnr6cFKDcdCGTW4SYYVc+1hwFm01Qtaadda6+0DriMWiHK\n" +
                "2TQYF6SDhlE+9okQFF7i/ctOEbGOGbKfgTLhNjvorqLwBhQO4MDLdK3Hucx83MKb\n" +
                "nCJGoe/8j+rKOQIzKbTlrjsc/WRgME1OVWrpPrvBnEzVpK7Kz0R0xfzbFkonGN+b\n" +
                "eXrSF5XRVKYCNB37apNGl4QGWAbfwqGkFrNtmJmAm5xwprDh77IrcDK9zgRScQgT\n" +
                "7fZTf8dyH341QLW0QLkZcRJq++4qTpmFQo+TZ3Csr+qgwXvzffwC7Gvy59hRFCYb\n" +
                "gWZmhSxvc7NZLTFCD6z3lccTyrqoTh6ZUU8yaaK+wBsn7rCKaUspFUhOZ1YhIAx6\n" +
                "KKI+/yEgwE5faR7kcf/NrpsVT7PBMsWVtU6Pab2rri/YMvUXRh2JI8HlD5517A4k\n" +
                "TTOISLVpmsmJlWVi5H9uTDEK+0VsxpQl3PRGZPOxx6V0dMdDx5WzBlTMe861ldxX\n" +
                "SKch3X326PEQlgadys/mv9QALUaV04JSfLt6yazpmZZL3zLiajgrwsAdoNSHahWb\n" +
                "TXqrHSmmKWkXc6UfH6n5N9B9hXDr5yWXc+9vA3zRZKkNhELspCSBI36YJhylaKxy\n" +
                "pdMH/xF0+31OypFxK9tae7/FsR1sl62hc2MJeSGu5jIy7kFelNwTlr9GbmouW0tc\n" +
                "t/1jQryIDUSbSZ9wLUwOr7FbCB7hXFKCSMWBIvszES4Dx91y9USU+z1XQ9aJ8nCO\n" +
                "yw9b/TO3Ls57eCm5X5383JESQltHpoXaXC+aBxyFsoqOcD8Qn+Cez8R/slDC/TbH\n" +
                "q4hlHYkT78Iji2yqnSVlZMQtH7kFFU3f8hWdZoIEqIzhrMLprVAGIAiFWp7hjOxT\n" +
                "8ZjNZ4IM2qUFvuJhjXgxXnaECjzHfMwyKwEmRbxTj5gP1JwBvlkLHYm0LXdlYmdl\n" +
                "b3NlcnZpY2VzIDxsbHVtYnJvc29Ad2ViZ2Vvc2VydmljZXMuY29tPokCVAQTAQgA\n" +
                "PhYhBHesk8DINyzsP2RzmOHqjMCcjYVGBQJiQdlBAhsDBQkDwmcABQsJCAcCBhUK\n" +
                "CQgLAgQWAgMBAh4BAheAAAoJEOHqjMCcjYVGyosQAJ53TJDqhiWm/YWIcwyUQ8kP\n" +
                "t/Ahunzedn1357zXitMKEX843TibtxBXxsozqN91bvs8OCSMcOlBVKL+CqHA0uDo\n" +
                "zk7j8TCJyCtvhbweqMuil5RYf74z2wnrzWbUMQXSbqkpozfVXPdJYYLvdD++jPxB\n" +
                "0++JZQUkCETkMn+S3QEf2MuZ1t1v2EBoMR/yDgQE9GRNNmS76kdNeSEYfujjdoaN\n" +
                "6Hhtfpu6z9O5hJQ1ZdNQHteo5W4Qqa7ZjFT8mtmaPDnBLSG37JTxec/IqBhFA9BY\n" +
                "BAGBrtBdo/n3STvsI4US+Go9706+ieC2gsg/cYpPi8T7FQv2oNdN7dkC8M8SgbbI\n" +
                "VrYRF4WDQS9NSXMWM+vWQ2VXA4h9bvoetnF6ECTZigdPrYO/D0DdXYtFrDr2Ng6C\n" +
                "nXCBPzUVKxMP4Qx6nObcFp+GLiqir3jsWXLKeo/sJlMztMWFIGpP9MnTE9ACFxaV\n" +
                "7uH0sM/BHgTxxZPKBHZIn+9siWbq4RAEJqTc+9l+GOcLy7cfdOWxNF4YNk1fFWiQ\n" +
                "XFyYMh5kc1S5zLz/ciNA60B7/sdK/OHRD76jO+sFEP0wKw5msshN5naHCumFRPQK\n" +
                "3r3MF0ZS0wrBWyGVT6kzmsThjZd8EQkimeB96XN1RuuDl8t9G404i5I+fDhd/jr3\n" +
                "9Vj5t1PVhzXtSuLHJmVX";

        text = text.replace("\n", "").replace("\r", "");
        Log.d("messagetag",text);


    }
}