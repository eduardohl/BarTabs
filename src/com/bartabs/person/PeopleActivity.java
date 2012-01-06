package com.bartabs.person;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bartabs.R;

public class PeopleActivity extends Activity {

	private ListView mListView;
	private ArrayList<Person> mPersonList;
	private PersonListAdapter mPersonListAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.people);
		
		mPersonList = new ArrayList<Person>();
		
		mListView = (ListView) findViewById(R.id.person_list);
		
		initializeLayout();
		
		refrestList();
	}

	private void initializeLayout() {
		ImageButton addPersonButton = (ImageButton) findViewById(R.id.add_person_button);
		addPersonButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				EditText personNameEditText = (EditText) findViewById(R.id.person_name_edit_text);
				Person person = new Person();
				person.setName(personNameEditText.getText().toString());
				mPersonList.add(person);
				refrestList();
			}
		});
	}

	private void refrestList() {
		this.mPersonListAdapter = new PersonListAdapter(this, R.layout.people_item, mPersonList);

		mListView.setAdapter(this.mPersonListAdapter);
	}
	
	private class PersonListAdapter extends ArrayAdapter<Person> {

		public PersonListAdapter(Context context, int textViewResourceId, ArrayList<Person> people) {
			super(context, textViewResourceId);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View view = convertView;
			if (view == null){
				view = PeopleActivity.this.getLayoutInflater().inflate(R.layout.people_item, null);
			}
			Person person = mPersonList.get(position);
			if (person != null){
				ImageView image = (ImageView) view.findViewById(R.id.people_item_image);
				TextView text = (TextView) view.findViewById(R.id.people_item_text);

				image.setImageResource(android.R.drawable.btn_plus);
				text.setText(person.getName());
			}
			return view;
		}
		
		@Override
		public long getItemId(int position) {
			return mPersonList.get(position).getId();
		}
		
		@Override
		public int getCount() {
			return mPersonList.size();
		}
	}
}