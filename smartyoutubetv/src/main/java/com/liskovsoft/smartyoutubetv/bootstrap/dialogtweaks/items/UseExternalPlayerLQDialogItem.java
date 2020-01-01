package com.liskovsoft.smartyoutubetv.bootstrap.dialogtweaks.items;

import android.content.Context;
import com.liskovsoft.sharedutils.dialogs.GenericSelectorDialog.DialogSourceBase.DialogItem;
import com.liskovsoft.smartyoutubetv.R;
import com.liskovsoft.smartyoutubetv.prefs.SmartPreferences;

public class UseExternalPlayerLQDialogItem extends DialogItem {
    private final Context mContext;
    private final SmartPreferences mPrefs;

    public UseExternalPlayerLQDialogItem(Context context) {
        super(context.getResources().getString(R.string.tweak_open_externally_lq), false);

        mContext = context;
        mPrefs = SmartPreferences.instance(context);
    }

    @Override
    public boolean getChecked() {
        return SmartPreferences.USE_EXTERNAL_PLAYER_360p.equals(mPrefs.getUseExternalPlayer());
    }

    @Override
    public void setChecked(boolean checked) {
        mPrefs.setUseExternalPlayer(checked ? SmartPreferences.USE_EXTERNAL_PLAYER_360p : SmartPreferences.USE_EXTERNAL_PLAYER_NONE);
    }
}
