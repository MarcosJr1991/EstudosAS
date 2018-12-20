package marcosjr.com.carosselpicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import in.goodiebag.carouselpicker.CarouselPicker;

public class MainActivity extends AppCompatActivity {

    CarouselPicker carouselPicker1,carouselPicker2,carouselPicker3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carouselPicker1 = (CarouselPicker)findViewById(R.id.carroselPicker1);
        carouselPicker2 = (CarouselPicker)findViewById(R.id.carroselPicker2);
        carouselPicker3 = (CarouselPicker)findViewById(R.id.carroselPicker3);

        //Carrosel 1 com todas as imagens
        List<CarouselPicker.PickerItem> itemsImages = new ArrayList<>();
        itemsImages.add(new CarouselPicker.DrawableItem(R.mipmap.ic_launcher));
        itemsImages.add(new CarouselPicker.DrawableItem(R.mipmap.ic_launcher_round));
        itemsImages.add(new CarouselPicker.DrawableItem(R.mipmap.ic_launcher));
        CarouselPicker.CarouselViewAdapter imagesAdapter = new CarouselPicker.CarouselViewAdapter(this,itemsImages,0);
        carouselPicker1.setAdapter(imagesAdapter);

        //Carrosel 2 com todos os textos
        List<CarouselPicker.PickerItem> textItems = new ArrayList<>();
        textItems.add(new CarouselPicker.TextItem("UM",20));//20 é o tamanho do texto
        textItems.add(new CarouselPicker.TextItem("Dois",20));//20 é o tamanho do texto
        textItems.add(new CarouselPicker.TextItem("Tres",20));//20 é o tamanho do texto
        CarouselPicker.CarouselViewAdapter textAdapter = new CarouselPicker.CarouselViewAdapter(this,textItems,0);
        carouselPicker2.setAdapter(textAdapter);

        //Carrosel 3 com todas imagens e textos
        List<CarouselPicker.PickerItem> mixItems = new ArrayList<>();
        mixItems.add(new CarouselPicker.TextItem("UM",20));//20 é o tamanho do texto
        mixItems.add(new CarouselPicker.DrawableItem(R.mipmap.ic_launcher_round));
        mixItems.add(new CarouselPicker.TextItem("Tres",20));//20 é o tamanho do texto
        mixItems.add(new CarouselPicker.DrawableItem(R.mipmap.ic_launcher));
        CarouselPicker.CarouselViewAdapter mixAdapter = new CarouselPicker.CarouselViewAdapter(this,mixItems,0);
        carouselPicker3.setAdapter(mixAdapter);
    }
}
