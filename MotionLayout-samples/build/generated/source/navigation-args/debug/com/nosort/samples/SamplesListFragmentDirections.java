package com.nosort.samples;

import android.os.Bundle;
import android.support.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class SamplesListFragmentDirections {
  @NonNull
  public static ActionSamplesListFragmentToPreviewFragment actionSamplesListFragmentToPreviewFragment() {
    return new ActionSamplesListFragmentToPreviewFragment();
  }

  public static class ActionSamplesListFragmentToPreviewFragment implements NavDirections {
    private int layoutId = 0;

    private boolean showPaths = false;

    public ActionSamplesListFragmentToPreviewFragment() {
    }

    @NonNull
    public ActionSamplesListFragmentToPreviewFragment setLayoutId(int layoutId) {
      this.layoutId = layoutId;
      return this;
    }

    @NonNull
    public ActionSamplesListFragmentToPreviewFragment setShowPaths(boolean showPaths) {
      this.showPaths = showPaths;
      return this;
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      __outBundle.putInt("layoutId", this.layoutId);
      __outBundle.putBoolean("showPaths", this.showPaths);
      return __outBundle;
    }

    public int getActionId() {
      return com.nosort.samples.R.id.action_samplesListFragment_to_previewFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionSamplesListFragmentToPreviewFragment that = (ActionSamplesListFragmentToPreviewFragment) object;
      if (layoutId != that.layoutId) {
        return false;
      }
      if (showPaths != that.showPaths) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + layoutId;
      result = 31 * result + (showPaths ? 1 : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionSamplesListFragmentToPreviewFragment(actionId=" + getActionId() + "){"
          + "layoutId=" + layoutId
          + ", showPaths=" + showPaths
          + "}";
    }
  }
}
