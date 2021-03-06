/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataanalyzer;

import org.jfree.chart.plot.ValueMarker;

/**
 * @author aribdhuka
 * Class that holds CategorizedValueMarkers
 * Essentially just ValueMarkers and a String that defines which category they belong to
 * Also holds notes for the marker
 */
public class CategorizedValueMarker implements CategoricalHashTableInterface {
    private String TAG;
    private ValueMarker marker;
    private String notes;

    public CategorizedValueMarker() {
        TAG = "";
        marker = null;
        notes = "";
    }

    public CategorizedValueMarker(String TAG, ValueMarker marker) {
        this.TAG = TAG;
        this.marker = marker;
        notes = "";
    }
    
    public CategorizedValueMarker(String TAG, ValueMarker marker, String notes) {
        this.TAG = TAG;
        this.marker = marker;
        this.notes = notes;
    }

    public String getTAG() {
        return TAG;
    }

    public void setTAG(String TAG) {
        this.TAG = TAG;
    }

    public ValueMarker getMarker() {
        return marker;
    }

    public void setMarker(ValueMarker marker) {
        this.marker = marker;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String hashTag() {
        return TAG;
    }
}
