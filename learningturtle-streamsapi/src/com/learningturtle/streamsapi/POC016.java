/**
 * RUNTIMETURTLE CONFIDENTIAL - Do not distribute without prior approval
 *
 * Project: learningturtle-streamsapi
 *
 * Copyright � 2023 Runtime Turtle. All rights reserved.
 */
package com.learningturtle.streamsapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shreyansh pandey
 * @version v1.0
 * @since 12-Oct-2023
 * @link https://github.com/white-parrot/learning-turtle/blob/master/JavaStreamCodingQuestions.md
 */
public class POC016 {

	/* How to convert a List of objects into a Map by considering duplicated "KEYS" and store them in sorted order, keeping First occurrence of value 
	 * i.e. if To Objects are having Duplicate Keys with Different values, we will keep first occurrence of value for that key*/
	
	public static void main(String[] args) {
		
		
		/* List of Objects*/
		List<Note> notes = new ArrayList<>();
		notes.add(new Note("This", 5));
		notes.add(new Note("is", 8));
		notes.add(new Note("to", 1));
		notes.add(new Note("check", 9));
		notes.add(new Note("how", 23));
		notes.add(new Note("Object", 75));
		notes.add(new Note("is", 25));
		notes.add(new Note("to", 34));
		notes.add(new Note("to", 33));
		notes.add(new Note("work", 72));
		notes.add(new Note("with", 46));
		notes.add(new Note("check", 9));
		notes.add(new Note("Stream", 19));
		notes.add(new Note("Sorting", 76));
		notes.add(new Note("is", 99));
		
		notes.stream().sorted(Comparator.comparingInt(Note::getNoteId))
		.collect(Collectors.toMap(Note::getNote, Note::getNoteId, (oldValue, newValue) -> oldValue, LinkedHashMap::new))
		.entrySet()
		.forEach(x -> System.out.println(x.toString() +" | "+x.getValue()));
		
		System.out.println("-----------------------------------------------------");
		
		/* Keeping the Last Occurrence of the Value for the Duplicate Keys*/
		notes.stream().sorted(Comparator.comparingInt(Note::getNoteId))
		.collect(Collectors.toMap(Note::getNote, Note::getNoteId, (oldValue, newValue) -> newValue, LinkedHashMap::new))
		.entrySet()
		.forEach(x -> System.out.println(x.toString() +" | "+x.getValue()));
		/* for key "to" value is still 34, because we have sorted the List first, see the difference in the next program*/
		
		System.out.println("-----------------------------------------------------");
		
		notes.stream()
		.collect(Collectors.toMap(Note::getNote, Note::getNoteId, (oldValue, newValue) -> newValue, LinkedHashMap::new))
		.entrySet()
		.forEach(x -> System.out.println(x.toString() +" | "+x.getValue()));
		/* now for key "to" value is 33 here (because it is the last occurrence for this key), because we have sorted the List first*/
	}

}

class Note{
	String note;
	int noteId;
	
	public Note(String n, int i) {
		note = n;
		noteId = i;
	}

	public String getNote() {
		return note;
	}

	public int getNoteId() {
		return noteId;
	}

	@Override
	public String toString() {
		return "Note [note=" + note + ", noteId=" + noteId + "]";
	}

}
