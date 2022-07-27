package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();


        //TODO Remover mock de notícias
        List<News> news = new ArrayList<>();
        news.add(new News("Palmeiras acerta nova contratação com Ponte Preta", "Elenco do Palmeiras"));
        news.add(new News("Sport joga fora de casa", "Aproveitamento em jogos fora de casa"));
        news.add(new News("Avaí avança duas posições e sai da zona de rebaixamento", "Zona de rebaixamento sem definição"));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() { return news; }
}