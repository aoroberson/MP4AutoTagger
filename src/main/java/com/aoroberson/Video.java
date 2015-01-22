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

import java.awt.image.BufferedImage;

public class Video extends AbstractModelObject {

    private String m_title;
    private String m_director;
    private String m_genre;
    private String m_year;
    private String m_comments;
    private String m_description;
    private String m_filepath;
    private String m_filename;
    private BufferedImage m_posterImage;

    public Video() {
        m_title = "";
        m_title = "";
        m_director = "";
        m_genre = "";
        m_year = "";
        m_comments = "";
        m_description = "";
        m_filepath = "";
        m_filename = "";
        m_posterImage = null;
    }

    public Video(String title, String director, String genre, String year,
            String comments, String description, String filepath,
            String filename, BufferedImage posterImage) {
        m_title = title;
        m_director = director;
        m_genre = genre;
        m_year = year;
        m_comments = comments;
        m_description = description;
        m_filepath = filepath;
        m_filename = filename;
        m_posterImage = posterImage;
    }

    public String getTitle() {
        return m_title;
    }

    public void setTitle(String title) {
        String oldValue = m_title;
        m_title = title;
        firePropertyChange("title", oldValue, m_title);
    }

    public String getDirector() {
        return m_director;
    }

    public void setDirector(String director) {
        String oldValue = m_director;
        m_director = director;
        firePropertyChange("director", oldValue, m_director);
    }

    public String getGenre() {
        return m_genre;
    }

    public void setGenre(String genre) {
        String oldValue = m_genre;
        m_genre = genre;
        firePropertyChange("genre", oldValue, m_genre);
    }

    public String getYear() {
        return m_year;
    }

    public void setYear(String year) {
        String oldValue = m_year;
        m_year = year;
        firePropertyChange("year", oldValue, m_year);
    }

    public String getComments() {
        return m_comments;
    }

    public void setComments(String comments) {
        String oldValue = m_comments;
        m_comments = comments;
        firePropertyChange("comments", oldValue, m_comments);
    }

    public String getDescription() {
        return m_description;
    }

    public void setDescription(String description) {
        String oldValue = m_description;
        m_description = description;
        firePropertyChange("description", oldValue, m_description);
    }

    public String getFilepath() {
        return m_filepath;
    }

    public void setFilepath(String filepath) {
        m_filepath = filepath;
    }

    public String getFilename() {
        return m_filename;
    }

    public void setFilename(String filename) {
        m_filename = filename;
    }

    public BufferedImage getPosterImage() {
        return m_posterImage;
    }

    public void setPosterImage(BufferedImage posterImage) {
        this.m_posterImage = posterImage;
    }
}
