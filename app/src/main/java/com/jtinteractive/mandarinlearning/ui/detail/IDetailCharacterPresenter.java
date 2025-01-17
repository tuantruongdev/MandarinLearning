package com.jtinteractive.mandarinlearning.ui.detail;

import com.jtinteractive.mandarinlearning.data.remote.model.ExampleDetail;
import com.jtinteractive.mandarinlearning.data.remote.model.WordLookup;

import java.util.ArrayList;

/**
 * Created by macos on 16,August,2022
 */
public interface IDetailCharacterPresenter {
    boolean checkIfInDb(Boolean isFavorite);

    void checkWordLookUp();

    void onWordLookupResponse(WordLookup wordLookup);

    void onWordLookupReloadResponse(WordLookup wordLookup);

    void saveWord();

    void getExample();

    void onExampleResponse(ArrayList<ExampleDetail> exampleDetails);

    void onErrorExampleResponse();
}
