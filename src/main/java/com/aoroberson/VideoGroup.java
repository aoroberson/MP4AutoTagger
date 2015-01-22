/*
 * The MIT License
 *
 * Copyright 2015 aoroberson.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.aoroberson;

import java.util.ArrayList;
import java.util.List;

public class VideoGroup extends AbstractModelObject {

    private List<Video> m_videos = new ArrayList<Video>();
    private String m_name;

    public VideoGroup() {
    }

    public VideoGroup(String name) {
        m_name = name;
    }

    public String getName() {
        return m_name;
    }

    public void setName(String name) {
        String oldValue = m_name;
        m_name = name;
        firePropertyChange("name", oldValue, m_name);
    }

    public void addVideo(Video videos) {
        List<Video> oldValue = m_videos;
        m_videos = new ArrayList<Video>(m_videos);
        m_videos.add(videos);
        firePropertyChange("videos", oldValue, m_videos);
        firePropertyChange("videoCount", oldValue.size(), m_videos.size());
    }

    public void removeVideo(Video videos) {
        List<Video> oldValue = m_videos;
        m_videos = new ArrayList<Video>(m_videos);
        m_videos.remove(videos);
        firePropertyChange("videos", oldValue, m_videos);
        firePropertyChange("videoCount", oldValue.size(), m_videos.size());
    }

    public List<Video> getVideos() {
        return m_videos;
    }

    public int getVideoCount() {
        return m_videos.size();
    }
}
