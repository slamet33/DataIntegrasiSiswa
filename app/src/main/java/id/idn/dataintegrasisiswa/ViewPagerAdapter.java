//package id.idn.dataintegrasisiswa;
//
//import android.content.Context;
//import android.support.annotation.NonNull;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentTransaction;
//import android.support.v4.view.PagerAdapter;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import id.idn.dataintegrasisiswa.fragment.FirstPage;
//import id.idn.dataintegrasisiswa.fragment.FourthPage;
//import id.idn.dataintegrasisiswa.fragment.SecondPage;
//import id.idn.dataintegrasisiswa.fragment.ThirdPage;
//
///**
// * Created by hp on 3/9/2018.
// */
//
//class ViewPagerAdapter extends PagerAdapter {
//    private Context context;
//    public ViewPagerAdapter(Context context) {
//        this.context = context;
//    }
//
//    @Override
//    public int getCount() {
//        return 4;
//    }
//
//    @Override
//    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
//        return view == object;
//    }
//
//    @NonNull
//    @Override
//    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
//        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View view = layoutInflater.inflate(R.layout.activity_main, null);
//        final Fragment[] selectedFragment = {null};
//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                switch (position){
//                    case R.id.rbFirst:
//                        selectedFragment[0] = new FirstPage();
//                        break;
//                    case R.id.rbSecond:
//                        selectedFragment[1] = new SecondPage();
//                        break;
//                    case R.id.rbThird:
//                        selectedFragment[2] = new ThirdPage();
//                        break;
//                    case R.id.rbFourth:
//                        selectedFragment[3] = new FourthPage();
//                        break;
//                }
//
//                FragmentTransaction transaction = context.getSupportFragmentManager().beginTransaction();
//                transaction.setCustomAnimations(R.anim.anim_fadein, R.anim.anim_fadeout);
//                transaction.replace(R.id.replaceLayout, selectedFragment[position]);
//                transaction.commit();
//            }
//        });
//        return super.instantiateItem(container, position);
//
//    }
//}
