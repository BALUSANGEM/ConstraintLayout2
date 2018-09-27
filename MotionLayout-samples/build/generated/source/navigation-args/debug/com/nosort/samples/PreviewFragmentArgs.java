package com.nosort.samples;

import android.os.Bundle;
import android.support.annotation.NonNull;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class PreviewFragmentArgs {
  private int layoutId = 0;

  private boolean showPaths = false;

  private PreviewFragmentArgs() {
  }

  @NonNull
  public static PreviewFragmentArgs fromBundle(Bundle bundle) {
    PreviewFragmentArgs result = new PreviewFragmentArgs();
    bundle.setClassLoader(PreviewFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("layoutId")) {
      result.layoutId = bundle.getInt("layoutId");
    }
    if (bundle.containsKey("showPaths")) {
      result.showPaths = bundle.getBoolean("showPaths");
    }
    return result;
  }

  public int getLayoutId() {
    return layoutId;
  }

  public boolean getShowPaths() {
    return showPaths;
  }

  @NonNull
  public Bundle toBundle() {
    Bundle __outBundle = new Bundle();
    __outBundle.putInt("layoutId", this.layoutId);
    __outBundle.putBoolean("showPaths", this.showPaths);
    return __outBundle;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    PreviewFragmentArgs that = (PreviewFragmentArgs) object;
    if (layoutId != that.layoutId) {
      return false;
    }
    if (showPaths != that.showPaths) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + layoutId;
    result = 31 * result + (showPaths ? 1 : 0);
    return result;
  }

  @Override
  public String toString() {
    return "PreviewFragmentArgs{"
        + "layoutId=" + layoutId
        + ", showPaths=" + showPaths
        + "}";
  }

  public static class Builder {
    private int layoutId = 0;

    private boolean showPaths = false;

    public Builder(PreviewFragmentArgs original) {
      this.layoutId = original.layoutId;
      this.showPaths = original.showPaths;
    }

    public Builder() {
    }

    @NonNull
    public PreviewFragmentArgs build() {
      PreviewFragmentArgs result = new PreviewFragmentArgs();
      result.layoutId = this.layoutId;
      result.showPaths = this.showPaths;
      return result;
    }

    @NonNull
    public Builder setLayoutId(int layoutId) {
      this.layoutId = layoutId;
      return this;
    }

    @NonNull
    public Builder setShowPaths(boolean showPaths) {
      this.showPaths = showPaths;
      return this;
    }

    public int getLayoutId() {
      return layoutId;
    }

    public boolean getShowPaths() {
      return showPaths;
    }
  }
}
