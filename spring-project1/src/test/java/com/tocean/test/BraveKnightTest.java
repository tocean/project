package com.tocean.test;


import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import com.tocean.BraveKnight;
import com.tocean.Quest;
import static org.mockito.Mockito.*;
public class BraveKnightTest {

	@Test
	public void test() {
		Quest quest = mock(Quest.class);
		BraveKnight braveKnight = new BraveKnight(quest);
		braveKnight.embarkOnQuest();
		verify(quest, times(2)).embark();
		System.out.println("ok");
	}

	@Test
	public void testMock() {
	}
}
