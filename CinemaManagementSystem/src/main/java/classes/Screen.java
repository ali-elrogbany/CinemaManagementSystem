/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author alielrogbany
 */
public class Screen {
    private String screenType;
    private Speaker speaker;

    public Screen(String screenType, Speaker speaker) {
        this.screenType = screenType;
        this.speaker = speaker;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeakers(Speaker speaker) {
        this.speaker = speaker;
    }
}
