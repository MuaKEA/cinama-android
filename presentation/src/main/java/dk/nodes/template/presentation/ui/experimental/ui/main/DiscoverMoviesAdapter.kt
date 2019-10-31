package dk.nodes.template.presentation.ui.experimental.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import dk.nodes.template.presentation.R


private val TAB_TITLES = arrayOf(
        R.string.tab_text_4,
        R.string.tab_text_5,
        R.string.tab_text_6,
        R.string.tab_text_7

)

class DiscoverMoviesAdapter (private val context: Context, fm: FragmentManager)
    : FragmentStatePagerAdapter(fm) {





    var moviesSearhTxt: String = ""




    override fun getItemPosition(`object`: Any): Int {

        return POSITION_NONE;
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0->return MovieSearchFragment.newInstance(moviesSearhTxt,MovieViewType.Recommended)
            1->return MovieSearchFragment.newInstance(moviesSearhTxt,MovieViewType.TopRateMovie)
            2-> return MovieSearchFragment.newInstance(moviesSearhTxt,MovieViewType.PopularMovie)
            3->return MovieSearchFragment.newInstance(moviesSearhTxt,MovieViewType.NowPlaying)



        }


        return MovieSearchFragment.newInstance(moviesSearhTxt,MovieViewType.Recommended)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 6 total pages.
        return 4
    }




}